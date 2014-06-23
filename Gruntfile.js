module.exports = function(grunt) {

    grunt.registerTask('hello', 'say hello', function(){
        grunt.log.writeln("Hello from grunt");
    });

    grunt.registerTask('default', 'hello');
};