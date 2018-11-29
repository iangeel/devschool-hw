const gulp = require('gulp');
const del = require('del');
const runSequence = require('run-sequence');
const autoprefixer = require('gulp-autoprefixer');
const csso = require('gulp-csso');
const htmlmin = require('gulp-htmlmin');
const uglify = require('gulp-uglify-es').default;

const BROWSERS = [
  'ie >= 10',
  'chrome >= 34',
  'ff >= 30'
];

  gulp.task('styles', function() {
    return gulp.src('./src/styles/styles.css')
      .pipe(autoprefixer({ browsers: BROWSERS }))
      .pipe(csso())
      .pipe(gulp.dest('./build'));
  });
  
  gulp.task('scripts', function() {
    return gulp.src('./src/scripts/scripts.js')
      .pipe(uglify({
        mangle: true
      }))
      .pipe(gulp.dest('./build'));
  });
  
  gulp.task('html', function() {
    return gulp.src('./src/index.html')
      .pipe(htmlmin({
        collapseWhitespace: true,
        removeComments: true
      }))
      .pipe(gulp.dest('./build'));
  });
  
  gulp.task('clean', function() {
    return del(['build']);
  });
  
  gulp.task('default', ['clean'], function() {
    runSequence(
      'styles',
      'scripts',
      'html'
    );
  })