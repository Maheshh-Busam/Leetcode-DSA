// Last updated: 6/28/2026, 12:39:59 PM
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        return [x for x, y in collections.Counter(nums).most_common(k)]