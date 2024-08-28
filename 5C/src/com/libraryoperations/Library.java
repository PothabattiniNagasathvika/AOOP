package com.libraryoperations;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations{
	private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
	

	@Override
	public void removeBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book);
	}

	@Override
	public void addMember(com.libraryoperations.Member member1) {
		// TODO Auto-generated method stub
		 members.add((Member) member1);
	}

	@Override
	public void removeMember(Member member) {
		// TODO Auto-generated method stub
		members.remove(member);
	}
	public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Member findMember(int memberId) {
        for (Member member : members) {
            if (((com.libraryoperations.Member) member).getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

	public void addBook(Book book1) {
		// TODO Auto-generated method stub
		books.add(book1);
		
	}

	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		
	}
}


