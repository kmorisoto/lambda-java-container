# lambda-java-container

DockerfileのCMDに使いたいハンドラーを指定する    
RequestHandlerを実装してるならクラス名だけでOK    

```dockerfile
CMD [ "com.example.HandlerString" ]
```


```shell
docker build -t hello-world .  
docker run -p 9000:8080 hello-world   
```

```shell
# com.example.HandlerString
curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '"MYSTRING"'

# com.example.Handler
curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"payload":"hello world!"}'
```
