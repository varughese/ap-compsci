# ap-compsci
Collection of AP Computer Science homeworks and projects

## Basic Git Tutorial

Type this command into whatever directory you want to put the files in.
```
git clone https://github.com/varughese/ap-compsci.git
```

When you make a change, type this to see what you have changed.
```
git status
```

Then, to add your changes (which is kind of like "saving" them in git world) enter this command. (The period just means add everything)
```
git add .
```

Then, you need to write a message that explains what you did before you push it up. Type this command:
```
git commit -m "Enter whatever message you did here"
```

Then, to push your changes up to GitHub so it is live on the internet, type
```
git push origin master
```

Always do the following command to make your stuff up to date with whatever is most current. If you push something to a file that I have made changes to, something will happen called a conflict. This just means that our code is in conflict, and we need to determine which one to save.
```
git pull
```


