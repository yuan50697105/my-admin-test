@echo off
call gradlew clean bootJar
call mkdir %USERPROFILE%\desktop\gradle
call mkdir %USERPROFILE%\desktop\gradle\exe
REM call mkdir %USERPROFILE%\desktop\gradle\lib
for /r . %%i in (*application*.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\exe /y
REM for /r . %%i in (*dev.jar) do call xcopy /q /a %%i %USERPROFILE%\desktop\gradle\lib /y
call gradlew clean