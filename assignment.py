'''Data Encryption System: Rahul wants to send encoded messages to his friend Ram. Develop an algorithm to encode all the digits, special characters, lower and upper case alphabets.

Here's one way to encode characters in a message:

1)Create a mapping between characters and their encoded representations. For example:
a -> 1, b -> 2, c -> 3, ... z -> 26
A -> 27, B -> 28, ... Z -> 52
0 -> 53, 1 -> 54, ... 9 -> 62
special characters -> 63, 64, ...
2)For each character in the message, look up its encoded representation in the mapping and replace it with the corresponding encoded representation.
3)The encoded message will be the concatenation of all the encoded representations.'''
def encode_message(message):
    mapping = {}
    for i in range(26):
        mapping[chr(97 + i)] = str(i + 1)
        mapping[chr(65 + i)] = str(26 + i + 1)
    for i in range(10):
        mapping[str(i)] = str(52 + i + 1)
    special_chars = "!@#$%^&*()_+-=[]{}|;':\",./<>?"
    for i in range(len(special_chars)):
        mapping[special_chars[i]] = str(62 + i + 1)
    print(mapping)
    encoded_message = ""
    for char in message:
        if char == ' ':
            encoded_message+=' '
        else:
            encoded_message += mapping[char]
    return encoded_message

message = "Hello World!"
encoded_message = encode_message(message)
print(encoded_message)

