package com.daaw;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class H83 implements InterfaceC3081a93 {
    public static final Map h = new C2407Ua();
    public static final String[] i = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map f;
    public final List g;

    public H83(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        D83 d83 = new D83(this, null);
        this.d = d83;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, d83);
    }

    public static H83 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        H83 h83;
        synchronized (H83.class) {
            Map map = h;
            h83 = (H83) map.get(uri);
            if (h83 == null) {
                try {
                    H83 h832 = new H83(contentResolver, uri, runnable);
                    try {
                        map.put(uri, h832);
                    } catch (SecurityException unused) {
                    }
                    h83 = h832;
                } catch (SecurityException unused2) {
                }
            }
        }
        return h83;
    }

    public static synchronized void d() {
        try {
            for (H83 h83 : h.values()) {
                h83.a.unregisterContentObserver(h83.d);
            }
            h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Map b() {
        Map map;
        Map map2 = this.f;
        if (map2 == null) {
            synchronized (this.e) {
                try {
                    map2 = this.f;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = (Map) S83.a(new W83() { // from class: com.daaw.z83
                                @Override // com.daaw.W83
                                public final Object zza() {
                                    return this.a.c();
                                }
                            });
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                        this.f = map;
                        map2 = map;
                    }
                } finally {
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final /* synthetic */ Map c() {
        Cursor cursorQuery = this.a.query(this.b, i, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map c2407Ua = count <= 256 ? new C2407Ua(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c2407Ua.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c2407Ua;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.g.iterator();
                if (it.hasNext()) {
                    AbstractC6314li0.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC3081a93
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) b().get(str);
    }
}
