package com.libraryoperations;

import java.lang.reflect.Member;

public interface LibraryOperations {
	void addBook(Book book);
    void removeBook(Book book);
    void addMember(Member member);
    void removeMember(Member member);
	void addMember(com.libraryoperations.Member member1);
}
