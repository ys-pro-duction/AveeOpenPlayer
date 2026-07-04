package com.daaw;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N21 {
    public static final long a(Reader reader, Writer writer, int i) throws IOException {
        G10.g(reader, "<this>");
        G10.g(writer, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(reader, writer, i);
    }

    public static final String c(Reader reader) {
        G10.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
