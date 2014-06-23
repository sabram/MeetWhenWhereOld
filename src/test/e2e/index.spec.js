describe('letsmeet homepage', function() {
    it('should display correct title', function() {
        browser.get('http://localhost:8080');
        expect(browser.getTitle()).toBe("Let's Meet!");
    });
});