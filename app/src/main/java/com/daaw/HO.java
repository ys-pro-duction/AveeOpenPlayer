package com.daaw;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.daaw.TO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class HO {
    public static final Comparator a = new Comparator() { // from class: com.daaw.FO
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return HO.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {
        public final ContentProviderClient a;

        public b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // com.daaw.HO.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // com.daaw.HO.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    public static class c implements a {
        public final ContentProviderClient a;

        public c(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // com.daaw.HO.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // com.daaw.HO.a
        public void close() throws Exception {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                IO.a(contentProviderClient);
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List d(LO lo, Resources resources) {
        return lo.b() != null ? lo.b() : OO.c(resources, lo.c());
    }

    public static TO.a e(Context context, LO lo, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), lo, context.getResources());
        return providerInfoF == null ? TO.a.a(1, null) : TO.a.a(0, g(context, lo, providerInfoF.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, LO lo, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = lo.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(lo.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + lo.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, a);
        List listD = d(lo, resources);
        for (int i = 0; i < listD.size(); i++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i));
            Collections.sort(arrayList, a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.TO.b[] g(android.content.Context r16, com.daaw.LO r17, java.lang.String r18, android.os.CancellationSignal r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HO.g(android.content.Context, com.daaw.LO, java.lang.String, android.os.CancellationSignal):com.daaw.TO$b[]");
    }
}
