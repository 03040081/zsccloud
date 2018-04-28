package zsc.zzc.biz;

import java.util.List;
import java.util.Map;

import zsc.zzc.entity.Comment;

public interface CommentBiz {

	public List<Comment> listComments(Map<Object, Object> map);

	public void insertComment(Comment comment);
}
