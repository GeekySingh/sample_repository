package com.example.app

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_palindrome() {
        val palindrome = Palindrome()

        assertTrue(palindrome.checkPalindrome2("abcba"))
    }

    @Test
    fun test_non_palindrome() {
        val palindrome = Palindrome()

        assertTrue(!palindrome.checkPalindrome2("adda"))
    }

    @Test
    fun test_palindrome2() {
        val palindrome = Palindrome()

        assertTrue(palindrome.checkPalindrome3("adda"))
    }
}