package com.library

class Library {

	String location
	String openingHours

static hasMany=[librarians: Librarian, books:Book, students:Student]

    static constraints = {
	location()
	openingHours()
    }
}
