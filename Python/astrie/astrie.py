from typing import List
class TrieNode:
    def __init__(self) -> None:
        self.links = {}
        self.equalto = 0
        self.startswith = 0

class AsTrie:
    def __init__(self) -> None:
        self.root = TrieNode()
        self.uniquecount = 0

    def insert(self, word: str) -> None:
        node = self.root
        for char in word:
            if char not in node.links:
                node.links[char] = TrieNode()
            node = node.links[char]
            node.startswith += 1
        if node.equalto == 0:
            self.uniquecount += 1
        node.equalto += 1

    def insert_many(self,word_list: List[str])-> None:
        for word in word_list:
            self.insert(word)

    def delete(self, word: str) -> None:
        node = self.root
        for char in word:
            if char not in node.links:
                return
            node = node.links[char]
            node.startswith -= 1
        if node.equalto > 0:
            node.equalto -= 1

    def delete_many(self, word_list: List[str])-> None:
        for word in word_list:
            self.delete(word)

    def reset(self)-> None:
        self.root = TrieNode()
        self.uniquecount = 0
    
    def search(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node.links:
                return False
            node = node.links[char]
        return node.equalto > 0

    def starts_with(self, prefix: str) -> bool:
        node = self.root
        for char in prefix:
            if char not in node.links:
                return False
            node = node.links[char]
        return True

    def starts_with_count(self, prefix: str) -> int:
        node = self.root
        for char in prefix:
            if char not in node.links:
                return 0
            node = node.links[char]
        return node.startswith

    def word_equals_to_count(self, word: str) -> int:
        node = self.root
        for char in word:
            if char not in node.links:
                return 0
            node = node.links[char]
        return node.equalto

    def count_unique_words(self) -> int:
        return self.uniquecount

    def get_words(self):
        return self._get_words_helper(self.root,"")
    
    def _get_words_helper(self, node, current_word):
        if node.equalto>0:
            yield current_word
        
        for char, child in node.links.items():
            yield from self._get_words_helper(child,current_word+char)

    def words_starts_with(self,word):
        node = self.root
        for char in word:
            if char not in node.links:
                return
            node = node.links[char]
        yield from self._get_words_helper(node,word)