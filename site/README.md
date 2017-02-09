# JSTracker Site

This module includes all of frontend code for JSTracker: html, js and css. JSTracker site is a
single page app. It has a static index.html and js that loads data from server using XHR and
renders it on a page.

### Development

These are early stages of the project so currently there is no established development workflow.
Current workflow is the following:

```shell
npm run build
```

which builds all js code into `target/bundle.js` and then open `index.html` which loads `bundle.js`.