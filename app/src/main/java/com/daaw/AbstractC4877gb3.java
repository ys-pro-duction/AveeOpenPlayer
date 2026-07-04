package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: com.daaw.gb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4877gb3 {
    public static Object a(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                    try {
                        Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return object;
                    } catch (Throwable th3) {
                        th = th3;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream == null) {
                            throw th;
                        }
                        objectInputStream.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        AbstractC7506py0.l(strArr);
        AbstractC7506py0.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String c(Context context, String str, String str2) {
        AbstractC7506py0.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC8742uP2.a(context);
        }
        return AbstractC8742uP2.b("google_app_id", resources, str2);
    }
}
