# Выполнение первой части задания

1. Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»  
```powershell
student@Ubuntu-MySQL-VirtualBox:~$ sudo apt update
...                            
Чтение списков пакетов… Готово
Построение дерева зависимостей       
Чтение информации о состоянии… Готово
Все пакеты имеют последние версии.
student@Ubuntu-MySQL-VirtualBox:~$ mkdir Игрушки_для_дошколят
student@Ubuntu-MySQL-VirtualBox:~$ mkdir Игрушки_для_Школьников
```
2. Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»

```powershell

student@Ubuntu-MySQL-VirtualBox:~$ cd Игрушки_для_дошколят
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_дошколят$ > Роботы
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_дошколят$ > Конструктор
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_дошколят$ > Настольные_Игры

```
3. Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»

```powershell 
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_дошколят$ cd ..
student@Ubuntu-MySQL-VirtualBox:~$ cd Игрушки_для_Школьников
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_Школьников$ >Мягкие_Игрушки
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_Школьников$ > Куклы
student@Ubuntu-MySQL-VirtualBox:~/Игрушки_для_Школьников$ > Машинки
```
4. Объединить 2 директории в одну «Имя Игрушки»  

```powershell
student@Ubuntu-MySQL-VirtualBox:~$ mkdir Имя_Игрушки
student@Ubuntu-MySQL-VirtualBox:~$ mv Игрушки_для_Школьников/ Игрушки_для_дошколят/ Имя_Игрушки/
student@Ubuntu-MySQL-VirtualBox:~$ cd Имя_Игрушки
student@Ubuntu-MySQL-VirtualBox:~/Имя_Игрушки$ ls
Игрушки_для_дошколят  Игрушки_для_Школьников
```
5. Переименовать директорию «Имя Игрушки» в «Игрушки»
```powershell
student@Ubuntu-MySQL-VirtualBox:~/Имя_Игрушки$ cd 
student@Ubuntu-MySQL-VirtualBox:~$ mv Имя_Игрушки/ Игрушки
student@Ubuntu-MySQL-VirtualBox:~$ ls
delfiletodir      iser_3.sh    user_3.sh  Загрузки     Музыка         Шаблоны
Dockerfile        print100     Видео      Игрушки      Общедоступные
examples.desktop  print100.sh  Документы  Изображения  Рабочий стол

```
6. Просмотреть содержимое каталога «Игрушки».
```powershell
student@Ubuntu-MySQL-VirtualBox:~/Игрушки$ ls -l
итого 8
drwxrwxr-x 2 student student 4096 апр 30 21:16 Игрушки_для_дошколят
drwxrwxr-x 2 student student 4096 апр 30 21:17 Игрушки_для_Школьников
```
7. Установить и удалить snap-пакет. (Любой, какой хотите)  

```powershell
student@Ubuntu-MySQL-VirtualBox:~$ sudo snap install tree
[sudo] пароль для student: 
2023-04-30T21:31:16+03:00 INFO Waiting for automatic snapd restart...
tree 1.8.0+pkg-3fd6 from 林博仁(Buo-ren, Lin) (brlin) installed
student@Ubuntu-MySQL-VirtualBox:~$ sudo snap remove tree
tree removed

```
8. Добавить произвольную задачу для выполнения каждые 3 минуты  
(Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).
```powershell
student@Ubuntu-MySQL-VirtualBox:~$ crontab -e
 */3 * * * * echo "hello world">>/home/student/logs.txt
 */3 * * * * cat /home/student/log && echo "File Created at $(date)" >> /home/student/log/log.txt
 student@Ubuntu-MySQL-VirtualBox:~$ crontab -l

```