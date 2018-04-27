// https://codefights.com/arcade/intro

/*
You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.

Assuming that your hunch is correct, decode the message.

Example

For code = "010010000110010101101100011011000110111100100001", the output should be
messageFromBinaryCode(code) = "Hello!".

The first 8 characters of the code are 01001000, which is 72 in the binary numeral system. 72 stands for H in the ASCII-table, so the first letter is H.
Other letters can be obtained in the same manner.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string code

    A string, the encrypted message consisting of characters '0' and '1'.

    Guaranteed constraints:
    0 < code.length < 800.

    [output] string

    The decrypted message.

*/



String messageFromBinaryCode(String code) {
    int len = code.length();
    int len2 = len; 
    String answer = "";
    int flag = 0;
    while(len > 8){
        String temp = code.substring(flag, flag+8);
        answer +=  ((char) Integer.parseInt(temp, 2)) + "";
        flag += 8;
        len -= 8;
    }
    return answer + ( (char) Integer.parseInt(code.substring(flag, len2), 2) );
}