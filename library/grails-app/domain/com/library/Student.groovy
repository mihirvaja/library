package com.library

class Student {

	String name
	String email
	String studentId
	Course course

    static constraints = {
	name()
	email()
	studentId()
	course()
    }
}
