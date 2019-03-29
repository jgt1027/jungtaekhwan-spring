package org.jth.example;

public class ArticleService {
	MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void addArticle() {
		memberDao.getMember();
		System.out.println("글을 등록했습니다.");
	}
}