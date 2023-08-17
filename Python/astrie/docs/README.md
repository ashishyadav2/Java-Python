Trie Module Documentation
=========================

This module provides a Trie (prefix tree) data structure implemented as the AsTrie class. The AsTrie class allows insertion, deletion, searching, and various querying operations on words stored in the trie.

Classes
-------
1. TrieNode
    A class representing a node in the Trie data structure. Each node contains links to its child nodes, counters for equal words and words that start with a given prefix.

2. AsTrie
    A class representing the Trie data structure. It provides methods for inserting, deleting, and searching words in the trie, as well as querying operations for words starting with a given prefix, counting unique words, and more.

Methods of AsTrie Class
-----------------------
1. __init__(self)
    Initialize an instance of the AsTrie class with an empty root node and a unique word counter.

2. insert(self, word: str)
    Insert a single word into the trie.

3. insert_many(self, word_list: List[str])
    Insert multiple words from a list into the trie.

4. delete(self, word: str)
    Delete a single occurrence of a word from the trie.

5. delete_many(self, word_list: List[str])
    Delete multiple words from a list in the trie.

6. reset(self)
    Reset the trie to its initial state by creating a new root node and resetting unique word count.

7. search(self, word: str) -> bool
    Check if a word exists in the trie.

8. starts_with(self, prefix: str) -> bool
    Check if any word in the trie starts with the given prefix.

9. starts_with_count(self, prefix: str) -> int
    Count the number of words in the trie that start with the given prefix.

10. word_equals_to_count(self, word: str) -> int
    Get the count of occurrences of a specific word in the trie.

11. count_unique_words(self) -> int
    Count the number of unique words in the trie.

12. get_words(self)
    Get a generator that yields all words stored in the trie.

13. words_starts_with(self, word)
    Get a generator that yields words starting with a specific prefix.

Usage Example
-------------
# Create an instance of AsTrie
trie = AsTrie()

# Insert words
trie.insert("apple")
trie.insert("app")
trie.insert("banana")

# Check if a word exists
print(trie.search("apple"))  # Output: True

# Count words starting with a prefix
print(trie.starts_with_count("app"))  # Output: 2

# Get all words in the trie
word_generator = trie.get_words()
for word in word_generator:
    print(word)

# Delete a word
trie.delete("app")

# Reset the trie
trie.reset()
