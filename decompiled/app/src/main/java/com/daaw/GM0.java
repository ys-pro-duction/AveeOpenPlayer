package com.daaw;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class GM0 {
    public final C9374wf0 a = new C9374wf0(1000);

    public String a(H70 h70) {
        String strM;
        synchronized (this.a) {
            strM = (String) this.a.g(h70);
        }
        if (strM != null) {
            return strM;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            h70.a(messageDigest);
            strM = AbstractC6559mb1.m(messageDigest.digest());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        synchronized (this.a) {
            this.a.k(h70, strM);
        }
        return strM;
    }
}
