package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {

when: "A Librarian has a name, email and telephone"

def librarian=new Librarian(name:'mihir',
				email:'mihir@hotmail.com',
				telephone:'333')

then: "the to String method will merge them."

librarian.toString()== 'mihir,mihir@hotmail.com,333'

    }
}
