def f(s):
    tmp = s[0]
    for i in xrange(1, len(s)):
        if tmp[-1] == s[i]:
            tmp += s[i]
        else:
            tmp = s[i]
        if len(tmp) == 3:
            s = s[:i - 2] + s[i + 1:]
            return f(s)
    return s


r = f("12233324")
s = f("AABBBABBBA")

print(r)
print(s)
