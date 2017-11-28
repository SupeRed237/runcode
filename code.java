import android.net.*; 
import android.app.*;
import android.os.*;
import java.io.*; 
import java.net.*;
import.android.widget.*; 
import android.view.*;
import java.util.*; 
import android.content.*; 

Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
startActivity(browserIntent);
