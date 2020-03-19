commands that i used
$ git init  
$ git status  
$ git add src README.md  
$ git status  
 /* On branch master  

No commits yet  

Changes to be committed:  
  (use "git rm --cached <file>..." to unstage)  

	new file:   README.md  
	new file:   src/loose/oose/fis/Main.java  
	new file:   src/loose/oose/fis/documents/Document.java  
	new file:   src/loose/oose/fis/documents/JSON.java  
	new file:   src/loose/oose/fis/documents/XML.java  
	new file:   src/loose/oose/fis/processors/Procesor.java  
	new file:   src/loose/oose/fis/processors/ProcesorCautare.java  
	new file:   src/loose/oose/fis/processors/ProcesorCompus.java  

 /*  

$ git commit -m "Codul 1:1 cu cel descarcat"  

/*  
[master (root-commit) 1c033f5] Codul 1:1 cu cel descarcat  
 8 files changed, 184 insertions(+)  
 create mode 100644 README.md  
 create mode 100644 src/loose/oose/fis/Main.java  
 create mode 100644 src/loose/oose/fis/documents/Document.java  
 create mode 100644 src/loose/oose/fis/documents/JSON.java  
 create mode 100644 src/loose/oose/fis/documents/XML.java  
 create mode 100644 src/loose/oose/fis/processors/Procesor.java  
 create mode 100644 src/loose/oose/fis/processors/ProcesorCautare.java  
 create mode 100644 src/loose/oose/fis/processors/ProcesorCompus.java
*/  

$ git remote set-url origin https://github.com/StanDarius24/FisProject2.git (am adaugat din greseala un alt link)  

$ git push origin master  
 /*  
Username for 'https://github.com': StanDarius24  
Password for 'https://StanDarius24@github.com':   
Enumerating objects: 16, done.  
Counting objects: 100% (16/16), done.  
Delta compression using up to 4 threads  
Compressing objects: 100% (12/12), done.  
Writing objects: 100% (16/16), 2.24 KiB | 573.00 KiB/s, done.  
Total 16 (delta 2), reused 0 (delta 0)  
remote: Resolving deltas: 100% (2/2), done.  
To https://github.com/StanDarius24/FisProject2.git  
 * [new branch]      master -> master  
*/  

$ git branch branch1  
$ git checkout branch1  
