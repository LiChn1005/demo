# Springboot JavaDoc接入Torna

官网教程

项目集成教程： https://torna.cn/tutorial/springboot.html

项目注释写法： https://torna.cn/dev/smart-doc.html#%E6%95%B4%E5%90%88smart-doc

#### smart-doc.json

```json
{
  "outPath": "target/doc",
  "projectName": "测试项目名称",
  "packageFilters": "com.gba.tech.testController.*",
  "openUrl": "http://10.153.131.68:7700/api",
  "appToken": "67f454035fed4a78af08ccc614502572",
  "debugEnvName": "发布环境",
  "debugEnvUrl": "http://10.153.131.69:8088",
  "tornaDebug": true,
  "replace": true,
  "requestHeaders": [
    {
      "required": true,
      "name": "GBA-TOKEN",
      "type": "string",
      "desc": "请求token",
      "value": "令牌"
    },
    {
      "required": true,
      "name": "GBA-PROJECT",
      "type": "string",
      "desc": "项目Code",
      "value": "YBC_TECH"
    },
    {
      "required": true,
      "name": "GBA-ROLE",
      "type": "string",
      "desc": "角色Code",
      "value": "TECH_COMMON/TECH_DEPT_ADMIN/TECH_TOP_ADMIN/TECH_EXPERT"
    }
  ]
}
```