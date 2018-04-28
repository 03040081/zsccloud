package zsc.zzc.biz.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zsc.zzc.biz.CommentBiz;
import zsc.zzc.dao.CommentDao;
import zsc.zzc.entity.Comment;

@Service
public class CommentBizImpl implements CommentBiz {

	@Autowired
	private CommentDao dao;
	
	@Override
	public List<Comment> listComments(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return dao.listComments(map);
	}

	@Override
	public void insertComment(Comment comment) {
		// TODO Auto-generated method stub
		dao.insertComment(comment);
	}

}
