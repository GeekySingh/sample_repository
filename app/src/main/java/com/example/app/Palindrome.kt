package com.example.app

class Palindrome {

    fun checkPalindrome(value: Int) {
        var result = 0
        var temp = value

        while(temp > 0) {
           val num = temp %10
            result *= 10 + num
            temp /= 10
        }

        if(result == value) {
            print("Palin")
        }

    }

    fun checkPalindromeString(value: String) { // 'abcba'
        var result = ""
        var i = 0
        while(i < value.length) {
            result = "${result}${value[i]}"
            i++
        }

        if(result == value) {
            print("Palindrome")
        } else {
            print("Not palindrome")
        }
    }

    fun checkPalindrome2(value: String) : Boolean{
        val midChar = value[value.length/2]
        val partitions = value.split(midChar)

        val reverseString = partitions[1].reversed()

        return partitions[0] == reverseString
    }

    fun checkPalindrome3(value: String) : Boolean{
        if(value.length / 2 != 0) return checkPalindrome2(value) // length = 6

        val partition1 = value.substring(0, value.length/2 - 1) // 0, 2
        val partition2 = value.substring(value.length/2, value.length-1) // 3, 5

        return partition1 == partition2
    }
}