describe('meetwhenwhere homepage', function() {
    it('should display correct title', function() {
        browser.get('http://localhost:9090/LetsMeet');
        expect(browser.getTitle()).toBe("Let's Meet!");
//        expect('hello').toEqual('hello');
    });
});
