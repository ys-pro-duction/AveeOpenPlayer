package com.daaw;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Ow0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1848Ow0 {
    public static int a(Context context, long j, long[] jArr, boolean z) {
        int length = jArr.length;
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {"_id"};
        Uri contentUri = MediaStore.Audio.Playlists.Members.getContentUri("external", j);
        ContentValues[] contentValuesArrD = null;
        if (z) {
            contentResolver.delete(contentUri, null, null);
        }
        Cursor cursorE = AbstractC2022Qi0.e(contentResolver, contentUri, strArr, null, null, null);
        if (cursorE == null) {
            return 0;
        }
        int count = cursorE.getCount();
        int iBulkInsert = 0;
        for (int i = 0; i < length; i += 1000) {
            contentValuesArrD = d(contentValuesArrD, jArr, i, 1000, count);
            iBulkInsert += contentResolver.bulkInsert(contentUri, contentValuesArrD);
        }
        return iBulkInsert;
    }

    public static int b(Context context, String str, long[] jArr) {
        Uri uriInsert;
        ContentResolver contentResolver = context.getContentResolver();
        if (AbstractC1454Lb1.d(context, str) >= 0) {
            return -1;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("name", str);
        ContentValues[] contentValuesArrD = null;
        try {
            uriInsert = contentResolver.insert(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e) {
            AbstractC0441Bk1.c("failed to create playlist: " + e.getMessage());
            e.printStackTrace();
            uriInsert = null;
        }
        if (uriInsert == null || jArr == null) {
            return 0;
        }
        int iBulkInsert = 0;
        for (int i = 0; i < jArr.length; i += 1000) {
            contentValuesArrD = d(contentValuesArrD, jArr, i, 1000, 0);
            iBulkInsert += contentResolver.bulkInsert(uriInsert, contentValuesArrD);
        }
        return iBulkInsert;
    }

    public static int c(Context context, long j) {
        return context.getContentResolver().delete(ContentUris.withAppendedId(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, j), null, null) > 0 ? 1 : 0;
    }

    public static ContentValues[] d(ContentValues[] contentValuesArr, long[] jArr, int i, int i2, int i3) {
        if (i + i2 > jArr.length) {
            i2 = jArr.length - i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i + i4];
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("play_order", Integer.valueOf(i3 + i + i4));
                contentValues.put("audio_id", Long.valueOf(j));
                arrayList.add(contentValues);
            }
        }
        if (contentValuesArr == null || contentValuesArr.length != arrayList.size()) {
            contentValuesArr = new ContentValues[arrayList.size()];
        }
        return (ContentValues[]) arrayList.toArray(contentValuesArr);
    }

    public static void e(Context context, long j, String str) {
        f(context, "" + j, str);
    }

    public static void f(Context context, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("name", str2);
        contentResolver.update(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{str});
    }
}
