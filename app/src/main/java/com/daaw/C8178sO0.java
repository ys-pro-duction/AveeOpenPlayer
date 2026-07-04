package com.daaw;

import android.content.Context;
import android.content.pm.Signature;
import com.daaw.C0954Gg1;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8178sO0 extends DB {
    public static Object[] b = {0, 0, 0, 0};

    /* JADX INFO: renamed from: com.daaw.sO0$a */
    public class a extends RuntimeException {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "";
        }
    }

    public C8178sO0() {
        f();
        WB0.p.b(new C0954Gg1.a() { // from class: com.daaw.qO0
            @Override // com.daaw.C0954Gg1.a
            public final Object invoke(Object obj, Object obj2) {
                return this.a.i(obj, (Integer[]) obj2);
            }
        }, this.a);
    }

    public static int c(Context context) {
        String[] strArr = {"87ec1545ce", "3f4af8b5d", "e27229c66e072", "4e"};
        List listD = AbstractC2315Td.d(strArr[0], strArr[1], new String[]{"e0418bb", "ec1545", "a9a844", "ba"}, new String[]{"3bc9", "52fc", "229c66", "95"}, new String[]{"388", "303f0", "303f0", "83"}, new String[]{"f52", "93a", "072e7357aea", "29"}, new String[]{"0b", "bc7", "c66e072e7357ae83f4a", "ae83ae83", "bb"});
        AbstractC2315Td.e(listD);
        String strF = AbstractC2315Td.f(listD);
        try {
            int i = 0;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                byte[] bArrDigest = messageDigest.digest(messageDigest.digest());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b2 : bArrDigest) {
                    String hexString = Integer.toHexString(b2 & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(hexString);
                }
                if (strF.equals(stringBuffer.toString())) {
                    return i + 34;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void d() {
        throw new a("");
    }

    public static void e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            d();
        }
    }

    public void f() {
        if (b[0].equals(0)) {
            b[0] = c(com.daaw.avee.a.k()) != 0 ? this : com.daaw.avee.a.p();
            b[1] = this;
        }
    }

    public final boolean g() {
        Object[] objArr = b;
        Object obj = objArr[0];
        return obj != null && objArr[1] != null && obj.equals(this) && b[1].equals(this);
    }

    public final /* synthetic */ void h(Integer[] numArr) {
        numArr[3] = !g() ? numArr[6] : numArr[2];
        numArr[2] = !g() ? numArr[5] : numArr[3];
    }

    public final /* synthetic */ Boolean i(Object obj, final Integer[] numArr) {
        Integer num = numArr[1];
        boolean z = !num.equals(num);
        e(new Runnable() { // from class: com.daaw.rO0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.h(numArr);
            }
        });
        return Boolean.valueOf(g() != z);
    }
}
