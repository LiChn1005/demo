## live template

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

groovyScript("def result = '';def params = \"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i =
0; i < params.size(); i++) {if(params[i] != '')result+='* @param ' + params[i] + ((i < params.size() - 1) ? '
\\r\\n ' : '')}; return result == '' ? null : '\\r\\n ' + result", methodParameters())

<font color="red" size="15"><b>return: </b></font>

xxxxxxxxxx {"outPath": "target/doc","projectName": "测试项目名称","packageFilters": "com.gba.tech.testController.*","
openUrl": "http://10.153.131.68:7700/api","appToken": "67f454035fed4a78af08ccc614502572","debugEnvName":"发布环境","
debugEnvUrl":"http://10.153.131.69:8088","tornaDebug": true,"replace": true,"
requestHeaders": [{    "required": true,    "name": "GBA-TOKEN",    "type": "string",    "desc": "请求token",    "value": "令牌"  },{    "required": true,    "name": "GBA-PROJECT",    "type": "string",    "desc": "项目Code",    "value": "YBC_TECH"  },{    "required": true,    "name": "GBA-ROLE",    "type": "string",    "desc": "角色Code",    "value": "TECH_COMMON/TECH_DEPT_ADMIN/TECH_TOP_ADMIN/TECH_EXPERT"  }]
}json

# file and code template

```java
**
        *TODO
        *
        *@mock 
 **/
```
