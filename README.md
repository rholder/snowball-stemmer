## What is this?
This is a repackaging of a version of the snowball-stemmer found at http://snowball.tartarus.org/ so that it's available
on Maven Central.

## Maven
```xml
<dependency>
  <groupId>com.github.rholder</groupId>
  <artifactId>snowball-stemmer</artifactId>
  <version>1.3.0.581.1</version>
</dependency>
```

## Gradle
```groovy
compile "com.github.rholder:snowball-stemmer:1.3.0.581.1"
```

## Versioning
In the absence of tags, branches, or releases in the original project SVN repository to call out a version, let's go
with what [PyStemmer](https://pypi.python.org/pypi/PyStemmer) is currently using and tack on the SVN revision number at
the end followed by my patch revision number (to fix anything weird that I introduce). For the initial version, we'll
use 1.3.0.581.1.

## License
This is a copy of the details about the license from [here](http://snowball.tartarus.org/license.php):

```
All the software given out on this Snowball site is covered by the BSD License
(see http://www.opensource.org/licenses/bsd-license.html ), with Copyright (c)
2001, Dr Martin Porter, and (for the Java developments) Copyright (c) 2002,
Richard Boulton.

Essentially, all this means is that you can do what you like with the code,
except claim another Copyright for it, or claim that it is issued under a
different license. The software is also issued without warranties, which means
that if anyone suffers through its use, they cannot come back and sue you. You
also have to alert anyone to whom you give the Snowball software to the fact
that it is covered by the BSD license.

We have not bothered to insert the licensing arrangement into the text of the
Snowball software.
```

## References
* http://snowball.tartarus.org
* https://github.com/snowballstem
