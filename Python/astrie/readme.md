1. insert(self, word: str): Inserts a word into the Trie, updating counts for nodes representing prefixes and complete words.

2. insert_many(self, word_list: List[str]): Inserts multiple words from a list using the insert method.

3. delete(self, word: str): Deletes a word from the Trie, decrementing counts for nodes representing prefixes and complete words.

4. delete_many(self, word_list: List[str]): Deletes multiple words from a list using the delete method.

5. reset(self): Resets the Trie to its initial state by creating a new root node and resetting the unique word count.

6. search(self, word: str): Searches for a complete word in the Trie and returns a boolean indicating its presence.

7. starts_with(self, prefix: str): Checks if there are any words in the Trie that start with the given prefix.

8. starts_with_count(self, prefix: str): Returns the count of words in the Trie that start with the given prefix.

9. word_equals_to_count(self, word: str): Returns the count of occurrences of a specific word in the Trie.

10. count_unique_words(self): Returns the count of unique words currently stored in the Trie.

11. get_words(self): Returns a generator that yields all complete words in the Trie.

12. _get_words_helper(self, node, current_word): A recursive helper method used by get_words to traverse the Trie and yield complete words.

13. words_starts_with(self, word): Returns a generator that yields all words in the Trie starting with a specific prefix.