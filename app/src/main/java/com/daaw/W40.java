package com.daaw;

import com.daaw.YV0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class W40 {
    public static final W40 a;
    public static final Set b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;
    public static final Set h;

    static {
        W40 w40 = new W40();
        a = w40;
        C7079oS0 c7079oS0 = C7079oS0.a;
        b = AbstractC10146zQ0.k(c7079oS0.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        c = AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(w40.b(), c7079oS0.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), c7079oS0.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c7079oS0.e("Double", "isInfinite()Z", "isNaN()Z")), c7079oS0.e("Float", "isInfinite()Z", "isNaN()Z")), c7079oS0.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c7079oS0.e("CharSequence", "isEmpty()Z"));
        d = c7079oS0.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        e = AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(AbstractC10146zQ0.j(c7079oS0.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c7079oS0.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c7079oS0.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c7079oS0.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c7079oS0.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c7079oS0.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c7079oS0.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f = AbstractC10146zQ0.j(AbstractC10146zQ0.j(c7079oS0.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c7079oS0.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c7079oS0.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = w40.a();
        String[] strArrB = c7079oS0.b("D");
        Set setJ = AbstractC10146zQ0.j(setA, c7079oS0.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = c7079oS0.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        g = AbstractC10146zQ0.j(setJ, c7079oS0.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = c7079oS0.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        h = c7079oS0.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    public final Set a() {
        C7079oS0 c7079oS0 = C7079oS0.a;
        EnumC6703n50 enumC6703n50 = EnumC6703n50.BYTE;
        List listN = AbstractC1599Mm.n(EnumC6703n50.BOOLEAN, enumC6703n50, EnumC6703n50.DOUBLE, EnumC6703n50.FLOAT, enumC6703n50, EnumC6703n50.INT, EnumC6703n50.LONG, EnumC6703n50.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            String strC = ((EnumC6703n50) it.next()).n().g().c();
            G10.f(strC, "asString(...)");
            String[] strArrB = c7079oS0.b("Ljava/lang/String;");
            AbstractC2141Rm.A(linkedHashSet, c7079oS0.e(strC, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    public final Set b() {
        C7079oS0 c7079oS0 = C7079oS0.a;
        List<EnumC6703n50> listN = AbstractC1599Mm.n(EnumC6703n50.BOOLEAN, EnumC6703n50.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC6703n50 enumC6703n50 : listN) {
            String strC = enumC6703n50.n().g().c();
            G10.f(strC, "asString(...)");
            AbstractC2141Rm.A(linkedHashSet, c7079oS0.e(strC, enumC6703n50.k() + "Value()" + enumC6703n50.h()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return d;
    }

    public final Set d() {
        return b;
    }

    public final Set e() {
        return g;
    }

    public final Set f() {
        return c;
    }

    public final Set g() {
        return f;
    }

    public final Set h() {
        return h;
    }

    public final Set i() {
        return e;
    }

    public final boolean j(BP bp) {
        G10.g(bp, "fqName");
        return G10.c(bp, YV0.a.i) || YV0.e(bp);
    }

    public final boolean k(BP bp) {
        G10.g(bp, "fqName");
        if (j(bp)) {
            return true;
        }
        C6607ml c6607mlN = C9489x30.a.n(bp);
        if (c6607mlN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(c6607mlN.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
