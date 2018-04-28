package zsc.zzc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zsc.zzc.biz.CommentBiz;
import zsc.zzc.entity.Comment;
import zsc.zzc.entity.VideoHttpResponse;
import zsc.zzc.utils.GenerateGUID;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentBiz biz;

	@RequestMapping("/select")
	@ResponseBody
	public VideoHttpResponse<List<Comment>> getComment(String sectionId,int currPage){
		VideoHttpResponse<List<Comment>> httpResponse=new VideoHttpResponse<List<Comment>>();
		List<Comment> list=null;
		try{
			Map<Object, Object> map=new HashMap<Object, Object>();
			map.put("sectionId", sectionId);
			map.put("currPage", (currPage-1)*10);
			list=biz.listComments(map);
			httpResponse.setCode(200);
			httpResponse.setRet(list);
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}

	@RequestMapping("/insert")
	@ResponseBody
	public VideoHttpResponse<String> insertComment(String sectionId,String userId,String content){
		VideoHttpResponse<String> httpResponse=new VideoHttpResponse<String>();
		try{
			String id=GenerateGUID.generateGUID();
			Comment comment=new Comment();
			comment.setId(id);
			comment.setSectionId(sectionId);
			comment.setUserId(userId);
			comment.setContent(content);
			biz.insertComment(comment);
			httpResponse.setCode(200);
			httpResponse.setRet("OK");
		}catch(Exception e){
			httpResponse.setMsg(e.getMessage());
			System.out.println(e.getMessage());
		}
		return httpResponse;
	}
}
