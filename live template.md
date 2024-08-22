## live template

> 方法体上的

```groovy
**
* TODO
        *
        *
@author lichangnan
*
@date $date$ $time$
$params$ $return$
** /
```

动态控制标签出现

<font color="red" size="15"><b>params: </b></font>

```
groovyScript("def result = '';def params = \"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {if(params[i] != '')result+='* @param ' + params[i] + ((i < params.size() - 1) ? '\\r\\n ' : '')}; return result == '' ? null : '\\r\\n ' + result", methodParameters())
```

<font color="red" size="15"><b>return: </b></font>

```
groovyScript("return \"${_1}\" == 'void' ? null : '\\r\\n * @return ' + \"${_1}\"", methodReturnType())
```

> 属性上的

```
**
 * TODO
 * 
 * @mock 
 **/
```

# file and code template

```java
/**
 * TODO
 *
 * @author lichangnan
 * @date ${DATE}
 **/
```
