package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: com.daaw.zJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10118zJ0 {
    public static boolean a(Context context, String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", str);
        contentValues.put("title", str3);
        contentValues.put("mime_type", str4);
        contentValues.put("artist", str2);
        contentValues.put("is_ringtone", Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        contentValues.put("is_notification", bool);
        contentValues.put("is_alarm", bool);
        contentValues.put("is_music", bool);
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(str);
        context.getContentResolver().delete(contentUriForPath, "_data=\"" + str + "\"", null);
        try {
            RingtoneManager.setActualDefaultRingtoneUri(context, 1, context.getContentResolver().insert(contentUriForPath, contentValues));
            AbstractC5075hI.a.a(context.getResources().getString(JD0.O4));
            return true;
        } catch (Exception unused) {
            AbstractC5075hI.a.a(context.getResources().getString(JD0.L4));
            return false;
        }
    }
}
