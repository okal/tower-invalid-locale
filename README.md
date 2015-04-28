## Demonstrating a bug in tower with :sw locale

Command             | Expected Output      | Actual Output
--------------------|----------------------|----------------------
`lein run en Peter` | "Hello, Peter"       | "Hello, Peter"
`lein run de Peter` | "Wie geht's, Peter?" | "Wie geht's, Peter?"
`lein run sw Peter` | "Habari, Peter?"     | clojure.lang.ExceptionInfo: Invalid locale: :sw {:loc :sw, :lang-only? nil}


## Exception details

```
Exception in thread "main" clojure.lang.ExceptionInfo: Invalid locale: :sw {:loc :sw, :lang-only? nil}, compiling:(/private/var/folders/9l/53gmx0zx5x3ftnm474z36xlm0000gq/T/form-init5189354094756136176.clj:1:124)
    at clojure.lang.Compiler.load(Compiler.java:7142)
    at clojure.lang.Compiler.loadFile(Compiler.java:7086)
    at clojure.main$load_script.invoke(main.clj:274)
    at clojure.main$init_opt.invoke(main.clj:279)
    at clojure.main$initialize.invoke(main.clj:307)
    at clojure.main$null_opt.invoke(main.clj:342)
    at clojure.main$main.doInvoke(main.clj:420)
    at clojure.lang.RestFn.invoke(RestFn.java:421)
    at clojure.lang.Var.invoke(Var.java:383)
    at clojure.lang.AFn.applyToHelper(AFn.java:156)
    at clojure.lang.Var.applyTo(Var.java:700)
    at clojure.main.main(main.java:37)
Caused by: clojure.lang.ExceptionInfo: Invalid locale: :sw {:loc :sw, :lang-only? nil}
    at clojure.core$ex_info.invoke(core.clj:4403)
    at taoensso.tower$fn__9191.doInvoke(tower.clj:82)
    at clojure.lang.RestFn.invoke(RestFn.java:410)
    at clojure.lang.AFn.applyToHelper(AFn.java:154)
    at clojure.lang.RestFn.applyTo(RestFn.java:132)
    at clojure.core$apply.invoke(core.clj:624)
    at clojure.core$memoize$fn__5097.doInvoke(core.clj:5846)
    at clojure.lang.RestFn.invoke(RestFn.java:408)
    at taoensso.tower$fmt_str.doInvoke(tower.clj:275)
    at clojure.lang.RestFn.applyTo(RestFn.java:142)
    at clojure.core$apply.invoke(core.clj:628)
    at taoensso.tower$make_t_uncached$new_t__9669.doInvoke(tower.clj:739)
    at clojure.lang.RestFn.invoke(RestFn.java:442)
    at invalid_locale.core$_main.doInvoke(core.clj:20)
    at clojure.lang.RestFn.invoke(RestFn.java:421)
    at clojure.lang.Var.invoke(Var.java:383)
    at user$eval5.invoke(form-init5189354094756136176.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:6703)
    at clojure.lang.Compiler.eval(Compiler.java:6693)
    at clojure.lang.Compiler.load(Compiler.java:7130)
```
