README

    Songpack is a package built and designed for use in Assignment 5 of the University of Southern
    Maine's COS285 Data Structures course, taught by Dr. Behrooz Mansouri.

    This program is intended to operate using a provided file named 'song_lyrics.tsv'

Configuration

    In order to use this program, one must have a Java compiler and Runtime environment installed.

Operation

    In order to use the program as intended, one must first compile the java files within the
    package. Following compilation, one may run the program by executing 'program5.java' in the 'songpack'
    package and passing the file path of 'song_lyrics.tsv' to the console, as input. The given program will only work when
    passing another input value into the console, which should be the name of a music genre. For example: 'rock'

    These are the only two lines that should be necessary to use the associated program...

    'javac ~/songpack/*.java'
    'java ~/songpack/program5 ~/song_lyrics.tsv rock'

    Upon execution, this program will output the following:
    Run time to find, and titles of the top ten songs by highest number of views, descending order
    Run time to clone the BST in which the Songs are stored
    Run time to filter the tree by songs from 1,000 to 10,0000 views and to verify that the filtered tree is a valid BST
    Run time to find and the artist who wrote the song with the highest views in the filtered BST


INCLUDED FILES

    Within the flightpack package, the following files are present...

    BinarySearchTree.java
    MyDataReader.java                   (By Dr. Behrooz Mansouri)
    program5.java
    Song.java                  (By Dr. Behrooz Mansouri)

    Other files included in this program...

    README.md                           (THIS FILE)
    song_lyrics.tsv                     (Data)



