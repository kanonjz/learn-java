#### 原因
maven导入的某个依赖corruptted
#### stackflow解答：
Any of the jar dependencies of your project seems to be corrupted. You could try deleting all your local maven repo folder, or if you could manage to know which is the corrupted one, just delete it.

After one of theese actions, just update maven dependencies and it should start working
