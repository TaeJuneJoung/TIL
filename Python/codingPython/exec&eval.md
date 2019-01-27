### exec()

 : The `exec()` method executes the dynamically created program, which is either a string or a code object.

```python
exec(object, globals, locals)
```

- object : Either a string or a code object
- globals (optional) : a dictionary
- locals (optional) : a mapping object. Dictionary is the standard and commonly used mapping type in Python.

The exec() doesn't return any value, it returns `None`.

```python
# ex)
keyWord = 'k = 3 + 4'
exec(keyWord)
print(k)        # 7

keyWord = 'k = 5;print(f"{k}의 3승 =",k**3)'
exec(keyWord)   # 5의 3승 = 125
print(k)        # 5
```

<br>

### eval()

 : The `eval()` method parses the expression passed to this method and runs python expression (code) within the program.

```python
# ex)
value = eval("3+4")
print(value)    # 7

value = eval("3**3")
print(value)    # 27

value = eval("True if 5>3 else False")
print(value)    # True

value = eval("if 5>3: print(True)")
print(value)    # SyntaxError: invalid syntax
```

