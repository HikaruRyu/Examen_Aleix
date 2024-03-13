# Test Plan for BalancedBrackets

## Test Cases

1. **Only brackets return true**
   - Input: `[]`
   - Expected Output: `true`
   - Description: The input consists only of brackets in the correct order, so the function should return true.

2. **Empty string returns true**
   - Input: `""`
   - Expected Output: `true`
   - Description: The input string is empty, which means there are no brackets to balance. The function should return true.

3. **String with non-bracket characters returns true**
   - Input: `[LaunchCode]`
   - Expected Output: `true`
   - Description: The input contains non-bracket characters along with balanced brackets. The function should return true.

4. **Nested brackets are allowed**
   - Input: `[[Launch][Code]]`
   - Expected Output: `true`
   - Description: The input contains nested brackets in the correct order. The function should return true.

5. **Unbalanced brackets return false**
   - Input: `[[LaunchCode]`
   - Expected Output: `false`
   - Description: The input contains unbalanced brackets, with one opening bracket without a corresponding closing bracket. The function should return false.

6. **Brackets must follow open-close order**
   - Input: `Launch]Code[`
   - Expected Output: `false`
   - Description: The input contains brackets that are not in the correct order. The function should return false.

7. **String with single opening bracket returns false**
   - Input: `[`
   - Expected Output: `false`
   - Description: The input contains a single opening bracket without a corresponding closing bracket. The function should return false.

8. **String with single closing bracket returns false**
   - Input: `]`
   - Expected Output: `false`
   - Description: The input contains a single closing bracket without a corresponding opening bracket. The function should return false.

9. **String with only opening bracket returns false**
   - Input: `[LaunchCode`
   - Expected Output: `false`
   - Description: The input contains only an opening bracket without a corresponding closing bracket. The function should return false.

10. **String with only closing bracket returns false**
    - Input: `LaunchCode]`
    - Expected Output: `false`
    - Description: The input contains only a closing bracket without a corresponding opening bracket. The function should return false.

11. **String with multiple opening brackets returns false**
    - Input: `[[Launch[Code]`
    - Expected Output: `false`
    - Description: The input contains multiple opening brackets without corresponding closing brackets. The function should return false.

12. **String with multiple closing brackets returns false**
    - Input: `[Launch]Code]`
    - Expected Output: `false`
    - Description: The input contains multiple closing brackets without corresponding opening brackets. The function should return false.
