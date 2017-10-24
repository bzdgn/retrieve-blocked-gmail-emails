#A Base64 Decoder and A Guide On How To Retrieve Blocked GMail Emails

## Getting Started
This project is a solution to retrieval of blocked gmail emails with the binary attachments
due to the security reasons.

In this README.md file I'll explain how to retrieve your blocked gmail email in Base64 encoded form
and then, I'll show how you are going to retrieve your original attachment with the provided software
within this project.

### A) How To Retrieve Blocked Gmail Email Content In Base64 Form

#### A-1) Retrieve The Email Attachment In Base64 Form

First you have to select the "Show Original" button on the right side of the pulldown menu;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/00_pulldown.png" alt="pulldown">
</p>

As show in below also;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/01_show_original.png" alt="show original">
</p>

Then you are going to see the content in as below, download the Base64 Encoded content of the attachement;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/02_download_original.png" alt="download-original">
</p>

#### A-2) Trim The Original Content

This is the content of your attachment, you must trim it so that only the Base64 Encoded part must be in the text file.
So first, trim the beginning of the file as below;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/03_trimming_a.png" alt="trimming-beginning-of-the-file">
</p>

And after then, delete the last line of the file as below;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/04_trimming_b.png" alt="trimming-end-of-the-file">
</p>

### B) Use Provided Software And Convert And Write Base64 Content Into Binary File

You have the appropriote Base64 Content finally. Convert it to binary with the desired output name as below;

	java -jar ConvertBase64.jar <input_file> <output_file>

A simple example is shown in below;

<p align="center">
	<img src="https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/screen-shots/05_convert_example.png" alt="example">
</p>

### C) Moreover

You can find the source code in the 
	
[ConvertBase64.java](https://github.com/bzdgn/retrieve-blocked-gmail-emails/blob/master/src/com/levent/base64bin/ConvertBase64.java)
	
directory as usual. But if you come here only to convert your Base64 content, go directly to the  

[/RunnableJar](RunnableJar)
	
folder.