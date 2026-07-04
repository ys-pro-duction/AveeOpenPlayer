package com.daaw;

import android.content.Context;
import android.util.Base64OutputStream;
import com.daaw.IV;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9460wx implements HV, IV {
    public final InterfaceC7569qB0 a;
    public final Context b;
    public final InterfaceC7569qB0 c;
    public final Set d;
    public final Executor e;

    public C9460wx(final Context context, final String str, Set set, InterfaceC7569qB0 interfaceC7569qB0, Executor executor) {
        this(new InterfaceC7569qB0() { // from class: com.daaw.tx
            @Override // com.daaw.InterfaceC7569qB0
            public final Object get() {
                return C9460wx.d(context, str);
            }
        }, set, executor, interfaceC7569qB0, context);
    }

    public static /* synthetic */ String c(C9460wx c9460wx) {
        String string;
        synchronized (c9460wx) {
            try {
                JV jv = (JV) c9460wx.a.get();
                List listC = jv.c();
                jv.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listC.size(); i++) {
                    KV kv = (KV) listC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", kv.c());
                    jSONObject.put("dates", new JSONArray((Collection) kv.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static /* synthetic */ JV d(Context context, String str) {
        return new JV(context, str);
    }

    public static /* synthetic */ C9460wx e(C4205eC0 c4205eC0, InterfaceC8295so interfaceC8295so) {
        return new C9460wx((Context) interfaceC8295so.a(Context.class), ((C7050oL) interfaceC8295so.a(C7050oL.class)).o(), interfaceC8295so.f(FV.class), interfaceC8295so.d(InterfaceC0826Fa1.class), (Executor) interfaceC8295so.c(c4205eC0));
    }

    public static /* synthetic */ Void f(C9460wx c9460wx) {
        synchronized (c9460wx) {
            ((JV) c9460wx.a.get()).k(System.currentTimeMillis(), ((InterfaceC0826Fa1) c9460wx.c.get()).a());
        }
        return null;
    }

    public static C3535bo g() {
        final C4205eC0 c4205eC0A = C4205eC0.a(InterfaceC2939Zd.class, Executor.class);
        return C3535bo.f(C9460wx.class, HV.class, IV.class).b(C6114kz.k(Context.class)).b(C6114kz.k(C7050oL.class)).b(C6114kz.m(FV.class)).b(C6114kz.l(InterfaceC0826Fa1.class)).b(C6114kz.j(c4205eC0A)).f(new InterfaceC9976yo() { // from class: com.daaw.sx
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return C9460wx.e(c4205eC0A, interfaceC8295so);
            }
        }).d();
    }

    @Override // com.daaw.HV
    public AbstractC6963o11 a() {
        return !AbstractC1865Pa1.a(this.b) ? A11.e("") : A11.c(this.e, new Callable() { // from class: com.daaw.ux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9460wx.c(this.a);
            }
        });
    }

    @Override // com.daaw.IV
    public synchronized IV.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JV jv = (JV) this.a.get();
        if (!jv.i(jCurrentTimeMillis)) {
            return IV.a.NONE;
        }
        jv.g();
        return IV.a.GLOBAL;
    }

    public AbstractC6963o11 h() {
        return this.d.size() <= 0 ? A11.e(null) : !AbstractC1865Pa1.a(this.b) ? A11.e(null) : A11.c(this.e, new Callable() { // from class: com.daaw.vx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9460wx.f(this.a);
            }
        });
    }

    public C9460wx(InterfaceC7569qB0 interfaceC7569qB0, Set set, Executor executor, InterfaceC7569qB0 interfaceC7569qB02, Context context) {
        this.a = interfaceC7569qB0;
        this.d = set;
        this.e = executor;
        this.c = interfaceC7569qB02;
        this.b = context;
    }
}
