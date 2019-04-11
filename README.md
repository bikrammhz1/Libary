# Libary
# Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# Step 2. Add the dependency

	dependencies {
                implementation 'com.github.bikrammhz1:Libary:1.0.3'
	}
	
# Usag

## For Log
  LogDeb.d(this,"nepal");
  LogDeb.d("TAG","nepal");
	  
## For Toast 
    Toasty.ToastLong(this,"hello");
    Toasty.ToastShort(this,"hello");
	    
## SnackBar
    SnackBar.show(this,"LENGTH_LONG_MESSAGE", Duration.LENGTH_LONG);
    SnackBar.show(this,"LENGTH_SHORT_MESSAGE", Duration.LENGTH_SHORT);
    SnackBar.show(this,"LENGTH_INDEFINITE_MESSAGE", Duration.LENGTH_INDEFINITE);
	    
## Show Dialog    
    DialogAnimation.successDialog(this,true,"#3d3123","Button Text", "Message",R.drawable.ic_circle);
	    
## Error Dialog
    DialogAnimation.errorDialog(this,true,"#3d3123","Button Text", "Message",R.drawable.ic_circle);
	
