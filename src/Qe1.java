public class Qe1 {
    /*
    Give the next five pseudorandom numbers generated by the process described on page 113,
     with a = 12, b = 5, and n = 100, and 92 as the seed for cur.
See page 113  next = (a ∗ cur + b) % n;

cur = 92
a = 12, b = 5, n = 100
next = (a * cur + b) % n
= (12 * 92 + 5) % 100
= (1104 + 5) % 100
= 1109 % 100
= 9
The first pseudorandom number is 9.

To generate the next number, we'll use the result from the previous step as the new value for cur.

cur = 9
next = (a * cur + b) % n
= (12 * 9 + 5) % 100
= (108 + 5) % 100
= 113 % 100
= 13
The second pseudorandom number is 13.

Repeat this process for the next three numbers:

cur = 13
next = (a * cur + b) % n
= (12 * 13 + 5) % 100
= (156 + 5) % 100
= 161 % 100
= 61
The third pseudorandom number is 61.

cur = 61
next = (a * cur + b) % n
= (12 * 61 + 5) % 100
= (732 + 5) % 100
= 737 % 100
= 37
The fourth pseudorandom number is 37.

cur = 37
next = (a * cur + b) % n
= (12 * 37 + 5) % 100
= (444 + 5) % 100
= 449 % 100
= 49
The fifth pseudorandom number is 49.

Therefore, the next five pseudorandom numbers generated by the process are: 9, 13, 61, 37, 49.


     */
}