# Object

```js
var person = {
    men:"BTS",
    women:"BlackPink",
    count:10,
    fuc:function(){return this.men + " / " + this.women;}
};

> person.men
BTS
> person["women"]
BlackPink
> person.count
10
> person.fuc()
BTS / BlackPink
> person.fuc
function(){return this.men + " / " + this.women;}
```

<br>

```js
var str = new String();		//Declares str as a String object
var num = new Number();		//Declares num as a Number object
var boo = new Boolean();	//Declares boo as a Boolean object
```

