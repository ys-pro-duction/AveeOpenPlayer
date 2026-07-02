package com.daaw;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1454Lb1 {
    public static int a(List list, C2078Qw0 c2078Qw0, int i) {
        while (i < list.size()) {
            if (((C2078Qw0) list.get(i)).d(c2078Qw0)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List b(Context context, int i) {
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "is_music != 0", null, "date_added DESC limit " + i);
        if (cursorE == null) {
            return new ArrayList();
        }
        List listE = e(cursorE);
        cursorE.close();
        return listE;
    }

    public static void c(Context context, List list, List list2) {
        String[] strArr = {"_id", "name"};
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            System.out.println("resolver = null");
            return;
        }
        Cursor cursorE = AbstractC2022Qi0.e(contentResolver, MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, strArr, "name != ''", null, "name");
        if (cursorE != null && cursorE.getCount() > 0) {
            cursorE.moveToFirst();
            while (!cursorE.isAfterLast()) {
                list.add(Long.valueOf(cursorE.getLong(0)));
                String string = cursorE.getString(1);
                if (string == null) {
                    string = "unnamed";
                }
                list2.add(string);
                cursorE.moveToNext();
            }
        }
        if (cursorE != null) {
            cursorE.close();
        }
    }

    public static int d(Context context, String str) {
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "name=?", new String[]{str}, "name");
        if (cursorE != null) {
            cursorE.moveToFirst();
            i = cursorE.isAfterLast() ? -1 : cursorE.getInt(0);
            cursorE.close();
        }
        return i;
    }

    public static List e(Cursor cursor) {
        return f(cursor, null);
    }

    public static List f(Cursor cursor, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        int columnIndex = cursor.getColumnIndex("audio_id");
        if (columnIndex == -1) {
            columnIndex = cursor.getColumnIndex("_id");
        }
        if (columnIndex != -1) {
            while (cursor.moveToNext()) {
                list.add(new C2078Qw0(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cursor.getLong(columnIndex))));
            }
        }
        return list;
    }
}
