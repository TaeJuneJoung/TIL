### Copy_button

```html
<!DOCTYPE html>
<html>
<body>

<input type="text" value="Copy Text" id="copy_text">
<button onclick="copyFunction()">Copy</button>

<script>
function copyFunction() {
  var copyText = document.getElementById("copy_text");
  copyText.select();
  document.execCommand("copy");
}
</script>

</body>
</html>
```

