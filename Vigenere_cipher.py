def vigenere_encrypt(plaintext, key):
    """Encrypts the plaintext using the Vigenère Cipher with the given key."""
    encrypted_text = []
    key_length = len(key)
    key_as_int = [ord(char) - 65 for char in key.upper()]
    plaintext_as_int = [ord(char) - 65 for char in plaintext.upper()]
    
    for i in range(len(plaintext_as_int)):
        if 0 <= plaintext_as_int[i] < 26:  # Only encrypt alphabetic characters
            value = (plaintext_as_int[i] + key_as_int[i % key_length]) % 26
            encrypted_text.append(chr(value + 65))
        else:
            encrypted_text.append(plaintext[i])  # Keep non-alphabetic characters as-is

    return ''.join(encrypted_text)


# Main program to take user inputs for encryption
if __name__ == "__main__":
    print("Vigenère Cipher Encryption Program")
    
    # Input plaintext and key from the user
    plaintext = input("Enter the plaintext: ").strip()
    key = input("Enter the key (alphabetic only): ").strip()
    
    # Validate the key
    if not key.isalpha():
        print("Error: The key must contain only alphabetic characters.")
    else:
        # Perform encryption
        encrypted_text = vigenere_encrypt(plaintext, key)
        print("Encrypted Text:", encrypted_text)
