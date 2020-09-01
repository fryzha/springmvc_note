<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    数据绑定

    <form action="/mvc/attr" method="post" enctype="multipart/form-data">
        testEntity.id<input name="testEntity.id" type="text" value="${testEntity.id}" ><br>
        testEntity.name<input name="testEntity.name" type="text" value="${testEntity.name}"><br>
        testEntity.date<input name="testEntity.date" type="text" value="01-01-2020" readonly><br>
        testEntity.nestedEntity.name<input name="testEntity.nestedEntity.name" type="text" value="${testEntity.nestedEntity.name}" ><br>
        testEntity.list[0].name<input name="testEntity.list[0].name" type="text" value="${testEntity.list[0].name}" ><br>
        testEntity.list[1].name<input name="testEntity.list[1].name" type="text" value="${testEntity.list[1].name}" ><br>
        testEntity.map[map1]<input name="testEntity.map['map1']" type="text" value="${testEntity.map['map1']}" ><br>
        testEntity.map['map2']<input name="testEntity.map['map2']" type="text" value="${testEntity.map['map2']}" ><br>
        file0<input name="file0" type="file"><br>
        testEntity.file<input name="testEntity.file" type="file"><br>
        <button type="submit">提交</button>
    </form>
</body>
</html>